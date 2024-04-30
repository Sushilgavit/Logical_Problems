package sortiing;

public class Demo {
    public static void main(String[] args) {
        int arr[]= {5,4,3,2,1};
        int size = arr.length;
        for(int i =0 ; i<size -1 ; i++)
        {
            for (int j=0 ; j<size-i-1 ; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }

        for(int num : arr)
        {
            System.out.print(num +" , ");
        }
    }
}

