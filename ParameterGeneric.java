class ParameterGeneric1<T,K>
{
    T obj1;
    K obj2;
    ParameterGeneric1(T obj1, K obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    public void getObject(){
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
class ParameterGeneric{
    public static void main(String args[]){
        ParameterGeneric1<String,Integer> obj = new ParameterGeneric1<String,Integer>("Satya",26);
        obj.getObject();
    }
}
