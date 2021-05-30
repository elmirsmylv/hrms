package kodlamaio.hrms.core.utilities.results;

import lombok.Data;

@Data
public class Results {

    private boolean success;
    private String message;

    public Results(boolean success){
        this.success = success;
    }
    public Results(boolean success, String message){
        this(success);
        this.message = message;
    }

}
