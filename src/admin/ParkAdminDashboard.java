package admin;

public class ParkAdminDashboard
{
    private String parkTitle;
    private String[] hours;
    private Object[] occupants;
    private Object[] rides;

    public ParkAdminDashboard(String parkTitle, String[] hours,
                              Object[] occupants, Object[] rides)
    {
        this.parkTitle = parkTitle;
        this.hours = hours;
        this.occupants = occupants;
        this.rides = rides;
    }

    public String getParkTitle()
    {
        return parkTitle;
    }

    public String[] getHours()
    {
        return hours;
    }

    public Object[] getOccupants()
    {
        return occupants;
    }

    public Object[] getRides()
    {
        return rides;
    }

    public void printSchedule()
    {
        //print out the park hours
    }

    public void printEmployees()
    {
        //print out all employees
    }

    public void printGuests()
    {
        //print out all guests
    }

    public void printRides()
    {
        //print out all rides
    }
}
