import java.util.TreeSet;

/**
 * File:
 * Package:
 *
 * Creation Date:
 * Author: Yang Feng
 * This document is a part of the source code and related artifacts
 * for ScienceVie, a part of Viome Portal Website. For more info:
 *
 * http://www.viome.com
 *
 * Copyright © , Viome, Inc.
 *
 * This software may be modified and distributed under the terms
 * of the ??? license.  See the LICENSE file for details.
 */
public class Entity {
    private String scoreId;
    private String valueType;

    public String getScoreId() {
        return scoreId;
    }

    public void setScoreId(String scoreId) {
        this.scoreId = scoreId;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    @Override
    public String toString() {
        return scoreId + "," + valueType;
    }
}
