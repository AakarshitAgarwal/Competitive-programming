s = s.toLowerCase();
   HashSet<Integer> h = new HashSet<Integer>();
    for (int i = 0; i < s.length(); i++) {
        if(s.charAt(i)!=' '){
            int put = (int)s.charAt(i);
            h.add(put);
        }
    }
    if(h.size()==26)
        System.out.println("pangram");
    else
        System.out.println("not pangram");