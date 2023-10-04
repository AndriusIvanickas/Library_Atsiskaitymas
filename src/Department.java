public class Department
{
    private String name;


    private  int numberOfPublications;
    private Library library;
    private Edition edition;
    private Edition[] editions;
    public Department(){}
    public Department(String name)
    {
        this.name = name;
        this.editions = new Edition[0];

    }
    public String getName()
    {
        return name;
    }
    public void setName (String name)
    {
        this.name = name;
    }

    public Edition[] getEditions() {
        return editions;
    }

    public Library getLibrary()
    {
        return library;
    }
    public Edition getEdition()
    {
        return edition;
    }
    public void addEdition(Edition element)
    {
        Edition[] newEdition = new Edition[editions.length + 1];
        for (int i = 0; i < editions.length; i++) {
            newEdition[i] = editions[i];

        }
       newEdition[editions.length] = element;
        editions = newEdition;
    }

    public int getNumberOfPublications() {
        if (editions != null) {
            return editions.length;
        } else {
            return 0;
        }
    }

    public String toString()
    {
        return "Department name: "+name;
    }
    public void sort()
    {
        for (int i =0; i< getEditions().length -1 ; i++)
        {
            for(int j=0; j< getEditions().length -i -1; j++)
            {
            if(editions[j].compareTo(editions[j+1]) < 0)
            {
                Edition temp = editions[j];
                editions[j]= editions[j+1];
                editions[j+1]= temp;
            }

            }
        }
    }


}


