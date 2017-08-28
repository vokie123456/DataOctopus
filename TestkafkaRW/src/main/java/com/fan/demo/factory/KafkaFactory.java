package com.fan.demo.factory;

import java.util.Properties;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;

import com.fan.demo.util.PropertiesUtils;

public class KafkaFactory {
	public static <K, V> Producer<K, V> createProducer() throws Exception {
		Properties props = PropertiesUtils.getProperties("send.properties");
		Producer<K, V> producer = new KafkaProducer<K, V>(props);
		return producer;
	}

	public static <K, V> Consumer<K, V> createConsumer() throws Exception {
		Properties props = PropertiesUtils.getProperties("rec.properties");
		Consumer<K, V> consumer = new KafkaConsumer<K, V>(props);
		return consumer;
	}

}
