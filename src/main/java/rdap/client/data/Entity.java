package rdap.client.data;

import java.util.List;

/**
 * This object class represents the information of organizations,
 * corporations, governments, non-profits, clubs, individual persons,
 * and informal groups of people.
 *
 * <pre>
 *    The entity object class can contain the following members:
 *
 *    o  objectClassName -- the string "entity"
 *
 *    o  handle -- a string representing a registry unique identifier of
 *       the entity
 *
 *    o  vcardArray -- a jCard with the entity's contact information
 *
 *    o  roles -- an array of strings, each signifying the relationship an
 *       object would have with its closest containing object (see
 *       Section 10.2.4 for a list of values)
 *
 *    o  publicIds -- see Section 4.8
 *
 *    o  entities -- an array of entity objects as defined by this section
 *
 *    o  remarks -- see Section 4.3
 *
 *    o  links -- see Section 4.2
 *
 *    o  events -- see Section 4.5
 *
 *    o  asEventActor -- this data structure takes the same form as the
 *       events data structure (see Section 4.5), but each object in the
 *       array MUST NOT have an "eventActor" member.  These objects denote
 *       that the entity is an event actor for the given events.  See
 *       Appendix B regarding the various ways events can be modeled.
 *
 *    o  status -- see Section 4.6
 *
 *    o  port43 -- see Section 4.7
 *
 *    o  networks -- an array of IP network objects as defined in
 *       Section 5.4
 *
 *    o  autnums -- an array of autnum objects as defined in Section 5.5
 * </pre>
 *
 * <pre>
 * Roles:
 *       Value: registrant
 *       Type: role
 *       Description: The entity object instance is the registrant of the
 *          registration.  In some registries, this is known as a
 *          maintainer.
 *       Registrant Name: IESG
 *       Registrant Contact Information: iesg@ietf.org
 *
 *
 *       Value: technical
 *       Type: role
 *       Description: The entity object instance is a technical contact for
 *          the registration.
 *       Registrant Name: IESG
 *       Registrant Contact Information: iesg@ietf.org
 *
 *
 *       Value: administrative
 *       Type: role
 *       Description: The entity object instance is an administrative
 *          contact for the registration.
 *       Registrant Name: IESG
 *       Registrant Contact Information: iesg@ietf.org
 *
 *
 *       Value: abuse
 *       Type: role
 *       Description: The entity object instance handles network abuse
 *          issues on behalf of the registrant of the registration.
 *       Registrant Name: IESG
 *       Registrant Contact Information: iesg@ietf.org
 *
 *             Value: billing
 *       Type: role
 *       Description: The entity object instance handles payment and
 *          billing issues on behalf of the registrant of the registration.
 *       Registrant Name: IESG
 *       Registrant Contact Information: iesg@ietf.org
 *
 *
 *       Value: registrar
 *       Type: role
 *       Description: The entity object instance represents the authority
 *          responsible for the registration in the registry.
 *       Registrant Name: IESG
 *       Registrant Contact Information: iesg@ietf.org
 *
 *
 *       Value: reseller
 *       Type: role
 *       Description: The entity object instance represents a third party
 *          through which the registration was conducted (i.e., not the
 *          registry or registrar).
 *       Registrant Name: IESG
 *       Registrant Contact Information: iesg@ietf.org
 *
 *
 *       Value: sponsor
 *       Type: role
 *       Description: The entity object instance represents a domain policy
 *          sponsor, such as an ICANN-approved sponsor.
 *       Registrant Name: IESG
 *       Registrant Contact Information: iesg@ietf.org
 *
 *       Value: proxy
 *       Type: role
 *       Description: The entity object instance represents a proxy for
 *          another entity object, such as a registrant.
 *       Registrant Name: IESG
 *       Registrant Contact Information: iesg@ietf.org
 *
 *
 *       Value: notifications
 *       Type: role
 *       Description: An entity object instance designated to receive
 *          notifications about association object instances.
 *       Registrant Name: IESG
 *       Registrant Contact Information: iesg@ietf.org
 *
 *       Value: noc
 *       Type: role
 *       Description: The entity object instance handles communications
 *          related to a network operations center (NOC).
 *       Registrant Name: IESG
 *       Registrant Contact Information: iesg@ietf.org
 *
 * </pre>
 *
 * @author dzh
 * @date 2019-03-27 18:00
 */
public class Entity extends CommonData {

    private List<String> roles; // abuse technical administrative noc registrant

    private List<Entity> entities;

    private List<Event> asEventActor;

    private List<Network> networks;

    private List<Autnum> autums;

    private List<Object> vcardArray; // 静态类型没法处理 TODO jCard https://tools.ietf.org/html/rfc7095

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public List<Entity> getEntities() {
        return entities;
    }

    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }

    public List<Event> getAsEventActor() {
        return asEventActor;
    }

    public void setAsEventActor(List<Event> asEventActor) {
        this.asEventActor = asEventActor;
    }

    public List<Network> getNetworks() {
        return networks;
    }

    public void setNetworks(List<Network> networks) {
        this.networks = networks;
    }

    public List<Autnum> getAutums() {
        return autums;
    }

    public void setAutums(List<Autnum> autums) {
        this.autums = autums;
    }

    public List<Object> getVcardArray() {
        return vcardArray;
    }

    public void setVcardArray(List<Object> vcardArray) {
        this.vcardArray = vcardArray;
    }

}
