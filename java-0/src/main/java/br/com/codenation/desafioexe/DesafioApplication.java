package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {

		int finish = 15;
		List<Integer> result = new ArrayList<>();

		for(int start = 0; start<finish;start++){
			if(start < 2){
				result.add(start);
			}else {
				result.add(result.get(start-1)+result.get(start-2));
			}
		}
		return result;
	}

	public static Boolean isFibonacci(Integer num) {

		return fibonacci().contains(num);
	}

	public static void main(String[] args) {
		System.out.println(fibonacci());
		System.out.println(isFibonacci(89));
	}
}