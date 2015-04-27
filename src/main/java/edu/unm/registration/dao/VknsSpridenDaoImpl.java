package edu.unm.registration.dao;

// Generated Apr 20, 2015 4:55:56 PM by Hibernate Tools 3.4.0.CR1

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

import edu.unm.registration.model.VknsSpriden;

/**
 * Home object for domain model class VknsSpriden.
 * @see .VknsSpriden
 * @author Hibernate Tools
 */
@Repository("vknsSpridenDao")
public class VknsSpridenDaoImpl extends AbstractDao implements VknsSpridenDao{

	private static final Log log = LogFactory.getLog(VknsSpridenDaoImpl.class);

	/*private final SessionFactory sessionFactory = getSessionFactory();

	public SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext()
					.lookup("SessionFactory");
			return getSession().getSessionFactory();
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	} */
	public void persist(VknsSpriden transientInstance) {
		log.debug("persisting VknsSpriden instance");
		try {
			getSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(VknsSpriden instance) {
		log.debug("attaching dirty VknsSpriden instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(VknsSpriden instance) {
		log.debug("attaching clean VknsSpriden instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(VknsSpriden persistentInstance) {
		log.debug("deleting VknsSpriden instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public VknsSpriden merge(VknsSpriden detachedInstance) {
		log.debug("merging VknsSpriden instance");
		try {
			VknsSpriden result = (VknsSpriden) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public List<VknsSpriden> findById(java.lang.String id) {
		/*log.debug("getting VknsSpriden instance with id: " + id);
		System.out.println("getting VknsSpriden instance with id: " + id);
		try {
			VknsSpriden instance = (VknsSpriden) getSession().get(VknsSpriden.class, id);
			System.out.println(instance.getSpridenFirstName());
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}*/
		
		/*Criteria criteria = getSession().createCriteria(VknsSpriden.class).add(Restrictions.eq("spridenId", id));
		return  (VknsSpriden) criteria.uniqueResult();*/
		
		String hql = "FROM VknsSpriden E WHERE E.spridenId = '" + id +"'";
		Query query = getSession().createQuery(hql);
		return  (List<VknsSpriden>) query.list();
	}

	public List findByExample(VknsSpriden instance) {
		log.debug("finding VknsSpriden instance by example");
		try {
			List results = getSession()
					.createCriteria("VknsSpriden")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<VknsSpriden> findAllSpridens() {
		Criteria criteria = getSession().createCriteria(VknsSpriden.class);
		System.out.println(criteria.list());
		return (List<VknsSpriden>) criteria.list();
	}
	
	/*public void saveSpriden(VknsSpriden employee) {
		persist(employee);
	}

	public void deleteSpridenbyId(String id) {
		Query query = getSession().createSQLQuery("delete from Employee where ssn = :id");
		query.setString("ssn", id);
		query.executeUpdate();
	}*/
}
