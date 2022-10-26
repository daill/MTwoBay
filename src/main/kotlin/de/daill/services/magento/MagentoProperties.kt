package de.daill.services.magento

import org.springframework.stereotype.Component
import javax.persistence.*

@Component
@Entity
@Table(name = "magento_settings")
class MagentoProperties {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    var id: Long? = null

    var consumerKey = ""
    var consumerSecret = ""
    var token = ""
    var tokenSecret = ""
    var verifier = ""
    var storeBaseUrl = ""
    var callbackUrl = ""

}