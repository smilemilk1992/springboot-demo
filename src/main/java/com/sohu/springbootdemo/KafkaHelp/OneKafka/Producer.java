package com.sohu.springbootdemo.KafkaHelp.OneKafka;

import com.sohu.springbootdemo.controller.TestController;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import javax.annotation.Resource;
import java.util.concurrent.ExecutionException;

/**
 * @author haochen
 * @date 2019/7/31 17:20
 */
@Component
public class Producer {
    private static final Logger logger = LoggerFactory.getLogger(Producer.class);

    @Autowired(required = false)
    private KafkaTemplate<String,String> kafkaTemplate;

    public void send(String topic, String message){
        ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send(topic,message);
        future.addCallback(new ListenableFutureCallback<SendResult<String, String>>() {
            @Override
            public void onFailure(Throwable throwable) {
                logger.info("Produce: The message failed to be sent:" + throwable.getMessage());
            }

            @Override
            public void onSuccess(SendResult<String, String> stringObjectSendResult) {
                //TODO 业务处理
                logger.info("Produce: The message was sent successfully:");
                logger.info("Produce: _+_+_+_+_+_+_+ result: " + stringObjectSendResult.toString());
            }
        });
    }

    /**
     * 发送消息到kafka
     */
    public RecordMetadata sendChannelMess(String topic, String message) {
        ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send(topic,message);
        RecordMetadata recordMetadata = null;
        try {
            recordMetadata = future.get().getRecordMetadata();
        } catch (InterruptedException|ExecutionException e) {
            e.printStackTrace();
            System.out.println("发送失败");
        }
        System.out.println("发送成功");
        System.out.println("partition:"+recordMetadata.partition());
        System.out.println("offset:"+recordMetadata.offset());
        System.out.println("topic:"+recordMetadata.topic());
        return recordMetadata;
    }
}
