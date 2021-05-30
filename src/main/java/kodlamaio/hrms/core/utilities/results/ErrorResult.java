package kodlamaio.hrms.core.utilities.results;

public class ErrorResult extends Results{

    public ErrorResult(){
        super(false);
    }

    public ErrorResult(String message){
        super(false,message);
    }
}
