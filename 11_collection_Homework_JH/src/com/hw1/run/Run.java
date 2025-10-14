package com.hw1.run;

import java.util.ArrayList;
import java.util.List;

import com.hw1.model.dto.Friend;

public class Run {

	public static void main(String[] args) {
		Friend f = new Friend();
		
		List<Friend> friendList = new ArrayList<>();
		
		friendList.add(new Friend("짱구"));
		friendList.add(new Friend("철수"));
		friendList.add(new Friend("유리"));
		friendList.add(new Friend("훈이"));
		friendList.add(new Friend("맹구"));
		
		int r = (int)(Math.random()*5);
		
		System.out.print(friendList.get(r).getName());
		f.pickLeader();

	}

}
