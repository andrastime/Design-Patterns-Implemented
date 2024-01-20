package player_role;

public class Free extends SubscriptionRole{
    public Free() {super(1);}
    public SubscriptionType getType(){
        return SubscriptionType.FREE;
    }
}
