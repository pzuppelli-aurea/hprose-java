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
 * DoubleArraySerializer.java                             *
 *                                                        *
 * double array serializer class for Java.                *
 *                                                        *
 * LastModified: Jul 31, 2016                             *
 * Author: Ma Bingyao <andot@hprose.com>                  *
 *                                                        *
\**********************************************************/

package hprose.io.serialize;

import static hprose.io.HproseTags.TagClosebrace;
import static hprose.io.HproseTags.TagList;
import static hprose.io.HproseTags.TagOpenbrace;
import java.io.IOException;
import java.io.OutputStream;

final class DoubleArraySerializer extends ReferenceSerializer<double[]> {

    public final static DoubleArraySerializer instance = new DoubleArraySerializer();

    @Override
    public final void serialize(Writer writer, double[] array) throws IOException {
        super.serialize(writer, array);
        OutputStream stream = writer.stream;
        stream.write(TagList);
        int length = array.length;
        if (length > 0) {
            ValueWriter.writeInt(stream, length);
        }
        stream.write(TagOpenbrace);
        for (int i = 0; i < length; ++i) {
            ValueWriter.write(stream, array[i]);
        }
        stream.write(TagClosebrace);
    }
}
