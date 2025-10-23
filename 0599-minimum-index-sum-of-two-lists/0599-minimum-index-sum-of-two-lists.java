class Solution {
    public String[] findRestaurant(String[] lst1, String[] lst2) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < lst1.length; i++) {
            map.put(lst1[i], i);
        }

        List<String> result = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;

        for (int j = 0; j < lst2.length; j++) {
            if (map.containsKey(lst2[j])) {
                int sum = map.get(lst2[j]) + j;
                if (sum < minSum) {
                    result.clear();
                    result.add(lst2[j]);
                    minSum = sum;
                } else if (sum == minSum) {
                    result.add(lst2[j]);
                }
            }
        }

        return result.toArray(new String[0]);
    }
}