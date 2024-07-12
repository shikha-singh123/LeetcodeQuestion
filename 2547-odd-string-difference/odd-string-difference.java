class Solution {
    
    public static List<Integer> count(String w) {
		int sum=0;
		List<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<w.length()-1;i++) {
			l.add(w.charAt(i+1)-w.charAt(i));
		}
		return l;
	}

	public String oddString(String[] words) {
		List<List<Integer>> l=new ArrayList<List<Integer>>();
		for(int i=0;i<words.length;i++) {
			String w=words[i];
			l.add(count(w));
		}
		for(int i=0;i<l.size()-1;i++) {
			if(l.get(i).equals(l.get(i+1))) continue;
			else {
				if(i==l.size()-1) return words[i+1];
				else if(i==0) {
					if(l.get(1).equals(l.get(2))) return words[0];
					else if(l.get(0).equals(l.get(2))) return words[1];
				}else return words[i+1];
			}
		}
		return "";
	}
}