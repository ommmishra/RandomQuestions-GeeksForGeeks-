class alpha{

    static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the arrya:");
        int x = sc.nextInt();
        int[] a = new int[x];
        
        System.out.println("Entering the elements in the array....");
        for(int i = 0; i<x; x++)
        {
        System.out.println("Enter element no."+(i+1));
            a[i]= sc.nextInt();
        }
        
        bubbleSort(a);
        
        for(int i=0; i< n -2; i++){
            for (int j = i+1; j < n-1; j++){
                for (int l = j+1; l<n; l++){

                    if(a[i]*a[i] + a[j]*a[j] == a[l]*a[l]){

                        System.out.println("a = " +a[i]+ " b = "+a[j]+ " c = "+a[l]);
                        break;
                    }

                    }
                }
            }
        }


    }
