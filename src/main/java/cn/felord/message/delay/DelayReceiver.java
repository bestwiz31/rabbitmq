package cn.felord.message.delay;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import cn.felord.message.bean.Msg;
import cn.felord.message.config.RabbitConfig;

@Component
public class DelayReceiver {

	@RabbitListener(queues = {RabbitConfig.PROCESS_QUEUE})
	public void process(Msg msg) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("当前时间: " + sdf.format(new Date()) + " ---> msg：[" + msg + "]");
	}
}
