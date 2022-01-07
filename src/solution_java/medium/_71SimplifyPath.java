package solution_java.medium;


import java.util.LinkedList;
import java.util.List;

public class _71SimplifyPath {
    public class Solution {
        public String simplifyPath(String path) {
            if (path == null || path.isEmpty()) {
                return "/";
            }
            String[] array = path.split("/");
            List<String> list = new LinkedList<>();
            for (int i = 0; i < array.length; i++) {
                String item = array[i];
                if (item.equals("..")) {
                    if (!list.isEmpty()) {
                        list.remove(list.size() - 1);
                    }
                } else if (!item.equals(".") && !item.isEmpty()) {
                    list.add(item);
                }
            }
            StringBuilder sb = new StringBuilder("/");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String item = list.get(0);
                sb.append(item);
                list.remove(0);
                if (!list.isEmpty()) {
                    sb.append("/");
                }
            }
            return sb.toString();
        }
    }
}
