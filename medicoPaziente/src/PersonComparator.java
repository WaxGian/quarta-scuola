public class PersonComparator implements java.util.Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.surname.compareTo(o2.surname) != 0 ? o1.surname.compareTo(o2.surname) : o1.name.compareTo(o2.name);
    }

}
