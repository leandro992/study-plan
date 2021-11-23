import com.estudo.application.dataprovider.entities.Restaurant
import com.estudo.application.mapper.RestaurantMapper

import org.junit.jupiter.api.Test
import java.math.BigDecimal
import javax.inject.Inject
import kotlin.test.assertEquals
import kotlin.test.assertNotNull


class RestaurantMapperTest {

    @Inject
   lateinit var restaurantMapper: RestaurantMapper

   //@GeneratedValue(strategy = GenerationType.IDENTITY)

    @Test
    fun `shouldMapToDomain`(){
        val map = Restaurant(id = 10, "victor", BigDecimal(10))

        val toDomain = restaurantMapper.toDomain(map)
        assertNotNull(toDomain)
        assertEquals(map.toString(), toDomain.toString())
    }

}