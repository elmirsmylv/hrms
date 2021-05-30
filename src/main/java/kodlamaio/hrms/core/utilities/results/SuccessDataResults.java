package kodlamaio.hrms.core.utilities.results;

public class SuccessDataResults<T> extends DataResult{

    public SuccessDataResults(T data, String message){
        super(data,true, message);
    }

    public SuccessDataResults(T data){
        super(data, true);
    }
}
