package com.foxinmy.weixin4j.action;

import com.foxinmy.weixin4j.msg.in.VideoMessage;
import com.foxinmy.weixin4j.type.MessageType;

/**
 * 视频消息响应
 * 
 * @className VideoAction
 * @author jy
 * @date 2014年10月9日
 * @since JDK 1.7
 * @see com.foxinmy.weixin4j.msg.in.VideoMessage
 */
@Action(msgType = MessageType.video)
public class VideoAction extends DebugAction<VideoMessage> {

}