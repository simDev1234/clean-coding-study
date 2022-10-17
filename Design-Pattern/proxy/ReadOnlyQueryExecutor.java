package proxy;

public class ReadOnlyQueryExecutor implements QueryExecutor {

    private final QueryExecutor queryExecutor;

    public ReadOnlyQueryExecutor(QueryExecutor queryExecutor) {
        this.queryExecutor = queryExecutor;
    }

    @Override
    public void execute(String sql) {
        if (!sql.startsWith("select")) {
            System.out.println("읽기전용이므로, CUD 권리는 수행되지 않습니다.");
            return;
        }
        System.out.println("sql : " + sql);
    }
}
