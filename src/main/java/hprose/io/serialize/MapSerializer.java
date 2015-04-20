/**********************************************************\
|                                                          |
|                          hprose                          |
|                                                          |
| Official WebSite: http://www.hprose.com/                 |
|                   http://www.hprose.org/                 |
|                                                          |
\**********************************************************/
/**********************************************************\
 *                                                        *
 * MapSerializer.java                                     *
 *                                                        *
 * Map serializer class for Java.                         *
 *                                                        *
 * LastModified: Apr 20, 2015                             *
 * Author: Ma Bingyao <andot@hprose.com>                  *
 *                                                        *
\**********************************************************/

package hprose.io.serialize;

import hprose.io.HproseWriter;
import java.io.IOException;
import java.util.Map;

final class MapSerializer implements HproseSerializer<Map> {

    public final static HproseSerializer instance = new MapSerializer();

    public final void write(HproseWriter writer, Map obj) throws IOException {
        writer.writeMapWithRef(obj);
    }
}
