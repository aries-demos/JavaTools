public class DateOperator{

    public static void main(String[] args) {
        //日期加减操作，日期比较操作
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
        Date lastSignInTime = new Date();
        Calendar stTime = Calendar.getInstance();
        stTime.add(Calendar.HOUR, -24);
        
        System.out.println(sdf.format(lastSignInTime));
        System.out.println(sdf.format(stTime.getTime()));
        System.out.println(lastSignInTime);
        System.out.println(stTime.getTime());
        System.out.println(lastSignInTime.before(stTime.getTime()));
    }
 
}