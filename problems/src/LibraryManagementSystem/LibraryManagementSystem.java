package LibraryManagementSystem;

import LibraryManagementSystem.Services.BrowsingService;
import LibraryManagementSystem.Services.CopyManager;

public class LibraryManagementSystem {
    CopyManager copyManager;
    BrowsingService browsingService;

    public LibraryManagementSystem(CopyManager copyManager, BrowsingService browsingService) {
        this.copyManager = copyManager;
        this.browsingService = browsingService;
    }
    
}
