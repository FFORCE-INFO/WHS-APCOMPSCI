package Lab16;

// ****************************************************************
// IntegerList.java
//
// Define an IntegerList class with methods to create, fill,
// sort, and search in a list of integers.
//          
// ****************************************************************



    public class IntegerList
   {
   
      int[] list; //values in the list
      int[] tem;
    //-------------------------------------------------------
    //create a list of the given size
    //-------------------------------------------------------
       public IntegerList(int size)
      {
         list = new int[size];
      }
   
   
    //-------------------------------------------------------
    //fill array with integers between 1 and 100, inclusive
    //-------------------------------------------------------
       public void randomize()
      {
         for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
      }
   
   
    //-------------------------------------------------------
    //print array elements with indices
    //-------------------------------------------------------
       public void print()
      {
         for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
      }
   
   
    //-------------------------------------------------------
    //return the index of the first occurrence of target in the list.
    //return -1 if target does not appear in the list
    //-------------------------------------------------------
       public int search(int target)
      {
         int location = -1;
         for (int i=0; i<list.length && location == -1; i++)
            if (list[i] == target)
               location = i;
         return location;
      }
   
   
    //-------------------------------------------------------
    //sort the list into ascending order using the selection sort algorithm
    //-------------------------------------------------------
       public void selectionSort()
      {
         int minIndex;
         for (int i=0; i < list.length-1; i++)
         {
         //find smallest element in list starting at location i
            minIndex = i;
            for (int j = i+1; j < list.length; j++)
               if (list[j] < list[minIndex])
                  minIndex = j;
         
         //swap list[i] with smallest element
            int temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;
         }
       
      }
        public void sortDecrasing()
        {
           int a, b, t;
            int size = list.length;

            for(a=1; a < size; a++)
                for(b=size-1; b >= a; b--){
                    if(list[b-1] > list[b]){ //If out of order
                       t = list[b-1];
                       list[b-1] = list[b];
                       list[b] = t;
          }
        }
        }
         public void replaceFirst(int oldVal ,int newVal)
    {
        for (int i=0; i < list.length ; i++)
        {
            if(list[i] == oldVal)
            {
                int temp = list[i];
                list[i] = newVal;
                newVal = temp;
            }
        }
    }
     public void replaceAll(int oldVal, int newVal)
    {
        for (int i=0; i< list.length-1; i++)
        {
            replaceFirst(oldVal,newVal);
        }
    }
    public void increaseSize()
    {
        int[] temp = new int[list.length + 1];
 
        for (int i =0; i< list.length; i++)
        {
            temp [i] = list[i];
        }
 
        list = temp;
    }
    public void addElement(int newVal)
    {
        increaseSize();
        list[list.length]=newVal;
        
    }
    
   public void removeFirst(int newVal){
        int position = 0;
        boolean removed = false;
        for(int i = 0; i<list.length;i++){
            if(list[i] == newVal){
                list[i]=0;
                position = i;
                removed = true;
                break;
            }
        }
        if(removed==true){
            for(int i = position;i<list.length;i++){
                if(i!=list.length-1){
                    list[i]=list[i+1];
                }
            }
            list[list.length-1]= 0;
        }
   }
    public void removeAll(int newVal)

    {

        int k=0;

        int l=0;

        while(k<list.length)

        {

            if(list[k]==newVal){
            list[k]=list[k+1];
            for (l=k+1;l< list.length - 1; l++)
            list[l]=list[l+1];
            list[list.length - 1]=0;

            }     

    k++;

    }

}

        public void addInOrder(int newVal)
    {
        int arraySize = list.length - 1;
        selectionSort();
        int insertionIndex = arraySize;
        for(int j = 0; j < arraySize; j++)
        {
            if(list[j] > newVal)
            {
                insertionIndex = j;
                break;
            }
        }
        for(int j = arraySize; j > insertionIndex; j--)
        {
            list[j] = list[j-1];
        }
        list[insertionIndex] = newVal;
 
        arraySize ++;   
    }
    
    }
   
   

