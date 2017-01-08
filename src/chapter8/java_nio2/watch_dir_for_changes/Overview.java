package chapter8.java_nio2.watch_dir_for_changes;

/**
 * Created by dan on 1/8/17.
 */
public class Overview {
    /**
     * - WatchService enables you to watch a directory for changes like addition, modification or deletion of contents of a directory
     * - The first step to watch a directory for changes is to create a WatchService object
     * - A WatchService object watches a directory for the following events;
     *     * StandardWatchEventsKinds.ENTRY_CREATE - This event occurs when a new file or directory is created, moved or renamed in the
     *       directory being watched
     *     * StandardWatchEventsKinds.ENTRY_DELETE - This event occurs when an existing file or directory is deleted, moved or renamed in the
     *       directory being watched
     *     * StandardWatchEventsKinds.ENTRY_MODIFY - This event is platform-dependent. It usually occurs when contents of an existing file are
     *       modified. It can also occur if the attributes of a file or directory (in the directory being watched) are modified
     *     * StandardWatchEventsKinds.OVERFLOW - This indicates that an event has been lost
     * - You can register multiple directories to be watched with the same WatchService object by using method register() of Path
     * - You can watch a directory for changes. If you try to register a file for changes, you'll get a runtime exception (NotDirectoryException).
     *   Registering a directory for any event (create, modify or delete) doesn't implicitly register its subdirectories
     * - The WatchKey object is a token that represents the registration of a Watchable object with a WatchService. A WatchKey object is created
     *   when you register your directory to be watched for create, modify or delete events with a WatchService
     * - A WatchKey can be in multiple states;
     *     * Ready - A WatchKey is initially created with a ready state
     *     * Signaled - When an event is detected, the WatchKey is signaled and queued. It can be retrieved using method WatchService's poll() or take()
     *     * Cancelled - Calling method cancel() on a WatchKey or closing the WatchService cancels a WatchKey
     *     * Valid - A WatchKey in a ready or signaled state is in a valid state
     * - A WatchService queues the registered events when they occur. The registered consumers can retrieve the queued WatchKeys and process the
     *   corresponding events
     * - The WatchService interface defines method take() and overloaded method poll() to retrieve the queued WatchKeys. Once a key is processed,
     *   the consumer invokes the keys method reset() so that it can be signaled and requeued for further events
     * - Method take() of the WatchService interface retrieves and removes the next WatchKey, waiting if none is yet present
     * - Method poll() of the WatchService interface retrieves and removes the nest WatchKey, or null if none is present (no waiting). You can also
     *   use its overloaded method poll(long timeout, TimeUnit unit) to specify the waiting time if none is present
     * - For each retrieved WatchKey, you can call WatchKeys method pollEvents() to retrieve and remove all pending events for the key
     * - Method pollEvents() returns a list of the events (WatchEvent) that were retrieved
     */
}
