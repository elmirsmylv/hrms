package kodlamaio.hrms.core.utilities.results;

public class SuccessResult extends Results{

    public SuccessResult(){
        super(true);
    }
    public SuccessResult(String message){
        super(true, message);
    }
}
