    //code1
    
    int s=a.size();
    List<Integer> RA=new ArrayList<Integer>();
    for(int i=s-1;i>=0;i--){
        RA.add(a.get(i));
    }
        return RA;
    

    //code2
    Collections.reverse(a);
    return a;