/*
 * Copyright 2022 Haulmont.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package test_support.entity.chained_entity_listeners;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import java.util.UUID;

@Table(name = "TEST_CHAINEDUPDATEENTITYTHREE", indexes = {
        @Index(name = "IDX_CHAINEDUPDATEENTITYTHREE", columnList = "ENTITY_TWO_ID")
})
@JmixEntity
@Entity(name = "test_ChainedUpdateEntityThree")
public class ChainedUpdateEntityThree {

    @JmixGeneratedValue
    @Id
    @Column(name = "ID", nullable = false)
    private UUID id;

    @Version
    @Column(name = "VERSION")
    private Integer version;

    @InstanceName
    @Column(name = "NAME")
    private String name;

    @Column(name = "AMOUNT")
    private Integer amount;

    @JoinColumn(name = "ENTITY_TWO_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private ChainedUpdateEntityTwo entityTwo;

    public ChainedUpdateEntityTwo getEntityTwo() {
        return entityTwo;
    }

    public void setEntityTwo(ChainedUpdateEntityTwo entityTwo) {
        this.entityTwo = entityTwo;
    }


    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}