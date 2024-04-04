public class lastButOne {
    public static void main(String[] args) {
        Long[] ids = new Long[]{22222l,33333l,11111l};
        Long lastButOne = -32767l;
        int lastButOneIndex = -1;
        int maxIndex = 0;
        Long max = ids[0];
        for(int i=1;i<ids.length;i++){
            if(ids[i]>max){
                lastButOne = max;
                lastButOneIndex = maxIndex;
                max = ids[i];
                maxIndex = i;
            }else{
                if(ids[i]>lastButOne){
                    lastButOneIndex = i;
                    lastButOne = ids[i];
                }
            }
        }
        System.out.println(lastButOneIndex);
        System.out.println(lastButOne);
    }
}
