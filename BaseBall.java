package sungil0211;

import java.util.*;
import java.io.*;

public class BaseBall {
	public static int playGame() throws IOException {
		int x, y, z;
		
		Random r = new Random();
		x = (r.nextInt()%9)+1;
		do { y = (r.nextInt()%9)+1; } while(x == y);
		do { z = (r.nextInt()%9)+1; } while(x == z && y == z);
		
		return playGame(x, y, z);
	}
	
	public static int playGame(int x, int y, int z) throws IOException {
		int count;
		int strike, ball;
		
		int[] usr = new int[3];
		int[] com = {x, y, z};
		
		System.out.println("숫자 게임 시작");
		 
		count = 0;
		do {
			count++;
			
			do {
				System.out.println("\n 카운드"+count);
				
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				String user;
				
				System.out.println("첫 번째 변수");
				user = in.readLine();
				usr[0] = new Integer(user).intValue();
				
				System.out.println("두 번째 변수");
				user = in.readLine();
				usr[1] = new Integer(user).intValue();
				
				System.out.println("세 번쨰 변수");
				user = in.readLine();
				usr[2] = new Integer(user).intValue();
				
				if((usr[0] == 0) || (usr[1] == 0) || (usr[2] == 0)) {
					System.out.println("0이외의 값을 입력하세요");
				} else if((usr[0] > 9) || (usr[1] > 9) || (usr[2] > 9)) {
					System.out.println("1~9 범위의 값을 입력하세요");
				} else if((usr[0] == usr[1]) || (usr[0] == usr[2]) ||
						(usr[1] == usr[0]) || (usr[1] == usr[2]) ||
						(usr[2] == usr[0]) || (usr[2] == usr[1])) {
					System.out.println("서로 다른 값을 입력하세요");
				}
			} while((usr[0] == 0) || (usr[1] == 0) || (usr[2] == 0) ||
					(usr[0] > 9) || (usr[1] > 9) || (usr[2] > 9) ||
					(usr[0] == usr[1]) || (usr[0] == usr[1]) ||
					(usr[1] == usr[0]) || (usr[1] == usr[2]) ||
					(usr[2] == usr[0]) || (usr[2] == usr[1]));
			
			strike = ball = 0;
			
			if(usr[0] == com[0]) strike++;
			if(usr[1] == com[1]) strike++;
			if(usr[2] == com[2]) strike++;
			
			if(usr[0] == com[1]) ball++;
			if(usr[0] == com[2]) ball++;
			if(usr[1] == com[0]) ball++;
			if(usr[1] == com[2]) ball++;
			if(usr[2] == com[0]) ball++;
			if(usr[2] == com[1]) ball++;
			System.out.println("strike : " + strike + "ball : " + ball);
			
		} while((strike < 3) && (count < 11));
		return count;
	}
	
	public static void main(String[] args) throws IOException {
		int result;
		
		if(args.length == 3) {
			int x = Integer.valueOf(args[0]).intValue();
			int y = Integer.valueOf(args[1]).intValue();
			int z = Integer.valueOf(args[2]).intValue();
			result = playGame(x, y, z);
		} else {
			result = playGame();
		}
	}
}