package ro.siit.gad.session4.composition;

public class Building {

    private String buildingNo;

    public Building(String buildingNo) {
        this.buildingNo = buildingNo;
    }

    public class Apartment{
        private String no;

        public Apartment(String no) {
            this.no = no;
        }

        public String getAddress(){
            return buildingNo + " > " + no;
        }
    }
}
