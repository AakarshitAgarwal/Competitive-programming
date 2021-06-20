public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int leftdiagonal=0;
    int rightdiagonal=0;
    for (int i=0;i<arr.size();i++){
        leftdiagonal = leftdiagonal+arr.get(i).get(i);
        rightdiagonal =rightdiagonal + arr.get(i).get(arr.size()-i-1);  //for Right diagonal iteration
    
    }
        return Math.abs(leftdiagonal-rightdiagonal);
    }