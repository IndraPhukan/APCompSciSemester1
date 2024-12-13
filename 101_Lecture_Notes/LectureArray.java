/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        // Your Code Goes here!
        //int [] arr = new int[8];
        int [] arr = {5,7,9,2,8,3,8,1};
        
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
        
        int dupeCheck = 8;
        
        for (int i = 0; i < arr.length; i++){
            if (dupeCheck == arr[i]){
                System.out.println(i);
                
            }
            
            if (Math.abs(arr[i] - arr[i-1]) == 3){
                System.out.println(i);
            
            }
            
            Integer.MIN_VALUE;
            
        }
        
        
        
	}
}