
package com.framework.core.proxy;

/*--- Imports -------------------------------------------------------------*/

/*--- Classes -------------------------------------------------------------*/

/**
 * Interface defining the {@link #getObjectId() getObjectId()} method to make object registration easier. Object
 * implementing this interface can be registered with the {@link ObjectBroker ObjectBroker} directly without specifying
 * an object id. The ObjectBroker will call <code>getObjectId()</code> internally.
 **/
public interface RemoteObject {

  /**
   * Returns the objectId that uniquely identifies this object in the system.
   */
  String getObjectId();

}
