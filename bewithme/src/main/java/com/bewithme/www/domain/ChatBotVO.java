package com.bewithme.www.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ChatBotVO {
	private int bot_num;
	private String id;
	private String title_content;
	private String btn_content;
	private String bot_content;
	private int count;
}
