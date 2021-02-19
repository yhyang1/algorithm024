class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> maps = new HashMap<Character, Integer>();
        HashMap<Character, Integer> mapt = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++) {
            Integer count = maps.get(s.charAt(i));
            if(count != null) {
                maps.put(s.charAt(i), maps.get(s.charAt(i))+1);
            } else {
                maps.put(s.charAt(i), 1);
            }

            count = mapt.get(t.charAt(i));
            if(count != null) {
                mapt.put(t.charAt(i), mapt.get(t.charAt(i))+1);
            } else {
                mapt.put(t.charAt(i), 1);
            }
        }
        return maps.equals(mapt);
    }
    public  int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(hashmap.containsKey(target - nums[i])) {
                return new int[]{hashmap.get(target - nums[i]), i};
            }
            hashmap.put(nums[i], i);
        }
        return null;
    }
    List<Integer> list = new ArrayList<Integer>();
    public List<Integer> preorder(Node root) {
        if (root == null) {
            return list;
        }
        Deque<Node> deque = new ArrayDeque<Node>();
        deque.addLast(root);
        while(!deque.isEmpty()) {
            Node node = deque.pop();
            list.add(node.val);
            Collections.reverse(node.children);
            for(Node child: node.children) {
                if(child != null) {
                    deque.push(child);
                }
            }
        }
        return list;
    }
}