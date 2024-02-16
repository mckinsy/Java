package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    public static long countPairs(List<Integer> arr)
     { 
          long ans = 0, mx = 0;

        Map<Integer, Integer> mp = new HashMap<>();
        for (int ai : arr) {

            mp.put(ai, mp.getOrDefault(ai, 0) + 1);

            mx = Math.max(mx, ai);
        }

        for (int i = 0; i <= mx; ++i) 
        {

            if (!mp.containsKey(i))
                continue;

            for (int j = i; j <= mx; ++j) 
            {

                if (!mp.containsKey(j))
                    continue;

                if (Long.bitCount(i & j) == 1) 
                {

                    if (i == j)
                        ans += ((long)mp.get(i)* (mp.get(i) - 1))/ 2;
                    else
                        ans += ((long)mp.get(i)) * mp.get(j);
                }
            }
        }
        return ans;
    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        long result = Result.countPairs(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
