package com.example.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pair<K, V> {

    K word;     //관심사
    V weight;   //가중치       //이때 이 가중치는 클릭수에 대해서 동적으로 변하는 변수이어야 한다. 아직 적용하기 전임.

    public Pair(K word, V weight){
        this.word = word;
        this.weight = weight;
    }
}

class WeightedRandom{
    private final List<Pair<String, Double>> candidates; //초기화를 해주지 않으면 빨간줄인데 (List문제는 아닌거 같고 private 이나 final 특성상 무조건 초기화를 해줘야하는거같음.)

    public WeightedRandom(List<Pair<String, Integer>> target){
        //1. 총 가중치 합 계산
        double totalWeight = 0;
        for(Pair<String, Integer> pair : target){   //가중치는 정수로 표현해도 되니까 Integer 인 것 같다. (내생각임)
            totalWeight += pair.weight;
        }

        //2. 주어진 가중치를 백분율로 치환 (가중치 / 총 가중치)
        List<Pair<String, Double>> candidates = new ArrayList<>();
        for(Pair<String, Integer> pair : target){
            candidates.add(new Pair<>(pair.word, pair.weight / totalWeight));
        }

        //3. 가중치의 오름차순으로 정렬
        candidates.sort(Comparator.comparingDouble(p -> p.weight));
        this.candidates = candidates;                   //여기서 초기화를 했기 때문에 빨간줄 사라짐
    }

    public String getRandom(){
        //1. 랜덤 기준점 설정
        final  double pivot = Math.random(); //0~1 사이에 랜덤숫자를 적용해주는거 같음. 찾아보던가

        //2. 가중치의 오름차순으로 원소들을 순회하며 가중치를 누적
        double acc = 0;
        for (Pair<String, Double> pair : candidates){
            acc += pair.weight;

            //3. 누적 가중치 값이 기준점 이상이면 종료
            if(pivot <= acc){
                return pair.word;
            }
        }
        return null; //String 반환 함수이기 때문에 반드시 리턴값이 String으로 있어야 한다. 그러나 null은 그냥 되는듯.
    }
}

class weightedRandomtest {
    public static void main(String[] args){
        List<Pair<String, Integer>> target = Arrays.asList(
                new Pair<>("Microsoft", 4),
                new Pair<>("Apple", 2),
                new Pair<>("Google", 9),
                new Pair<>("Amazon", 5)
        );

        WeightedRandom random = new WeightedRandom(target);

        int count = 10000;
        Map<String , Integer> wordCount = new HashMap<>();
        for(int i=0; i<count; i++){
            String word = random.getRandom();
            wordCount.put(word, 1+wordCount.getOrDefault(word, 0));
        }

        for(Map.Entry<String, Integer> e : wordCount.entrySet()){
            System.out.printf("%s 등장 확률 : %.2f\n", e.getKey(), (double) e.getValue() / (double) count);
        }
    }
}