package codeforces;

import java.util.*;

public class JerfixPeriods {
     static class Info {
            int first;      // first index
            int diff;       // common difference
            int last;       // last index
            boolean valid;  // is it still valid?
            int count;      // how many times it appeared

            Info(int pos) {
                first = pos;
                last = pos;
                diff = 0;
                valid = true;
                count = 1;
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            Map<Integer, Info> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                int pos = i + 1;  // 1-based index

                if (!map.containsKey(val)) {
                    map.put(val, new Info(pos));
                } else {
                    Info info = map.get(val);
                    int currentDiff = pos - info.last;

                    if (info.count == 1) {
                        info.diff = currentDiff;  // first time we find a difference
                    } else if (currentDiff != info.diff) {
                        info.valid = false;  // invalid AP
                    }

                    info.last = pos;
                    info.count++;
                }
            }

            // collect results
            List<int[]> result = new ArrayList<>();
            for (Map.Entry<Integer, Info> e : map.entrySet()) {
                int x = e.getKey();
                Info info = e.getValue();
                if (info.valid) {
                    result.add(new int[]{x, info.count == 1 ? 0 : info.diff});
                }
            }

            // sort by x
            result.sort(Comparator.comparingInt(a -> a[0]));

            // print
            System.out.println(result.size());
            for (int[] pair : result) {
                System.out.println(pair[0] + " " + pair[1]);
            }
        }
    }

