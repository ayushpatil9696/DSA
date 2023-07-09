public class array02 {

  static class pair {

    int min;
    int max;
  }

  static pair getMinMax(int arr[], int n) {
    pair minmax = new pair();
    int i;


    IF (n % 2 == 0) {
        if (arr[0]>arr[0]){
            minmax.max = arr[0];
            minmax.min = arr[1];
        }
        else{
            minmax.min = arr[0];
            minmax.max = arr[1];
        }
        i = 2;

    }
    else {
        minmax.min = arr[0];
        minmax.max = arr[1];
        i = 1;
    }

    while (i < n-1){
        
    }

  }
}
