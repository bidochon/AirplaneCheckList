package com.example.ventus.airplanechecklist;

/**
 * Created by j35 on 6/28/15.
 */
public class C150ListType {
    private String name;
    private String description;

    public static final C150ListType[] listTypes = {
            new C150ListType("Ground Before", "Everything before actual flight"),
            new C150ListType("Flight", "Various in flights check lists"),
            new C150ListType("Ground After", "Once back on the ground")
    };

    // constructor
    private C150ListType (String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() { return this.name; }

    public String getDescription() { return this.description; }

    public String toString() { return this.name; }

}
