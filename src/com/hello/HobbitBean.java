package com.hello;

public class HobbitBean {
    private String id;
    private String name;
    private String description;
    private boolean disabled;

    public HobbitBean(String id, String name, String description, boolean disabled) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.disabled = disabled;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public boolean isDisabled() { return disabled; }
}
