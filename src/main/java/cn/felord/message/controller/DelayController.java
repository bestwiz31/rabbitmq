package cn.felord.message.controller;

import cn.felord.message.bean.Msg;
import cn.felord.message.delay.DelaySender;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * 消息接口.
 *
 * @author dax.
 * @version v1.0
 * @since 2018 /2/23 17:27
 */
@RestController
@RequestMapping("/delay")
@Api("延迟队列")
public class DelayController {
	
    @Autowired
	private DelaySender delaySender;
	
	@ApiOperation("延时队列发送(发送消息的时候设置过期时间)")
	@RequestMapping(value = "/sendDelay", method = RequestMethod.POST)
	public String sendDelayMsg(@RequestBody Msg msg) {

		delaySender.sendDelayMsg(msg);

		return "success";

	}

	@ApiOperation("延时队列发送(整个队列设置过期时间，与msg没有关系)")
	@RequestMapping(value = "/sendQueueDelay", method = RequestMethod.POST)
	public String sendDelayQueueMsg(@RequestBody Msg msg) {

		delaySender.sendDelayQueue(msg);

		return "success";

	}

}
