class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char curS = s.charAt(i);
            char curT = t.charAt(i);

            if (!sMap.containsKey(curS)) {
                sMap.put(curS, 1);
            } else {
                int sCount = sMap.get(curS) + 1;
                sMap.put(curS, sCount);
            }

            if (!tMap.containsKey(curT)) {
                tMap.put(curT, 1);
            } else {
                int tCount = tMap.get(curT) + 1;
                tMap.put(curT, tCount);
            }
        }

        for (Character ch : sMap.keySet()) {
            Integer sCount = sMap.get(ch);
            Integer tCount = tMap.get(ch);

            if (tCount == null)
                return false;
            if (tCount.intValue() != sCount.intValue())
                return false;
        }
        return true;
    }
}
