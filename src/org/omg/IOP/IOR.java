package org.omg.IOP;


/**
* org/omg/IOP/IOR.java .
* Generated by the IDL-to-Java compiler (portable), version "3.1"
* from ../../../../src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Thursday, August 29, 2002 1:38:21 AM GMT-08:00
*/


/**
     * Captures information about a object references, such as whether the
     * object is null, what type it is, what protocols are supported, and what
     * ORB services are available.
     * <p>
     * This data structure need not be used internally to any given ORB, 
     * and is not intended to be visible to application-level ORB programmers.
     * It should be used only when crossing object reference domain 
     * boundaries, within bridges.
     * <p>
     * This data structure is designed to be efficient in typical 
     * single-protocol configurations, while not penalizing multiprotocol ones.
     * <p>
     * Object references have at least one tagged profile. Each profile 
     * supports one or more protocols and encapsulates all the basic 
     * information the protocols it supports need to identify an object. 
     * Any single profile holds enough information to drive a complete
     * invocation using any of the protocols it supports; the content 
     * and structure of those profile entries are wholly specified by 
     * these protocols. A bridge between two domains may need to know the 
     * detailed content of the profile for those domains' profiles,
     * depending on the technique it uses to bridge the domains.
     * <p>
     * Each profile has a unique numeric tag, assigned by the OMG. 
     * Profile tags in the range 0x80000000 through 0xffffffff are reserved 
     * for future use, and are not currently available for assignment.
     * <p>
     * Null object references are indicated by an empty set of profiles, 
     * and by a "Null" type ID (a string which contains only a single 
     * terminating character). A Null <code>TypeID</code> is the only 
     * mechanism that can be used to represent the type 
     * <code>CORBA.Object</code>. Type IDs may only be "Null" in any message, 
     * requiring the client to use existing knowledge or to consult the 
     * object, to determine interface types supported. The type ID 
     * is a Repository ID identifying the interface type, and is provided 
     * to allow ORBs to preserve strong typing. This identifier is agreed 
     * on within the bridge and, for reasons outside the scope of the
     * interoperability specification, needs to have a much broader scope to
     * address various problems in system evolution and maintenance. 
     * Type IDs support detection of type equivalence, and in conjunction 
     * with an Interface Repository, allow processes to reason about the 
     * relationship of the type of the object referred to and any other type.
     * <p>
     * The type ID, if provided by the server, indicates the most derived 
     * type that the server wishes to publish, at the time the reference 
     * is generated. The object's actual most derived type may later change 
     * to a more derived type. Therefore, the type ID in the IOR can only 
     * be interpreted by the client as a hint that the object supports at 
     * least the indicated interface. The client can succeed in narrowing 
     * the reference to the indicated interface, or to one of its base 
     * interfaces, based solely on the type ID in the IOR, but must not fail 
     * to narrow the reference without consulting the object via the
     * "_is_a" or "_get_interface" pseudo-operations.
     */
public final class IOR implements org.omg.CORBA.portable.IDLEntity
{

  /** The type id, represented as a String. */
  public String type_id = null;

  /** 
  	 * An array of tagged profiles associated with this 
  	 * object reference. 
  	 */
  public org.omg.IOP.TaggedProfile profiles[] = null;

  public IOR ()
  {
  } // ctor

  public IOR (String _type_id, org.omg.IOP.TaggedProfile[] _profiles)
  {
    type_id = _type_id;
    profiles = _profiles;
  } // ctor

} // class IOR
