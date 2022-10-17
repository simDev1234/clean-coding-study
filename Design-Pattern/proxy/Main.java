package proxy;

import java.beans.BeanProperty;

public class Main {
    public static void main(String[] args) {

        QueryExecutor queryExecutor = new QueryExecutorImpl();
        QueryExecutor readOnlyQueryExecutor = new ReadOnlyQueryExecutor(queryExecutor);

        readOnlyQueryExecutor.execute("select * from user where id = 1");
        readOnlyQueryExecutor.execute("update user set name = 'hello' where id = 1");
        readOnlyQueryExecutor.execute("delete from user where id = 2");

    }

    /*

    private QueryExecutor readOnlyQueryExecutor;

    public void query(String sql){
        readOnlyQueryExecutor.execute(sql);
    }

    @Bean
    public QueryExecutor queryExecutor(){
        return new QueryExecutorImpl();
    }

    @Bean
    public ReadOnlyQueryExecutor readOnlyQueryExecutor(){
        return new ReadOnlyQueryExecutor(queryExecutor);
    }

     */

}
