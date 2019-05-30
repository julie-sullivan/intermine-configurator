/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.8).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.DataTool;
import io.swagger.model.DataToolResponse;
import io.swagger.model.MineConfig;
import io.swagger.model.MineDescriptor;
import java.util.UUID;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-30T13:08:33.831Z[GMT]")
@Api(value = "mine", description = "the mine API")
public interface MineApi {

    @ApiOperation(value = "Delete config associated with mine instance", nickname = "deleteConfig", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Mine config succesfully deleted") })
    @RequestMapping(value = "/mine/config/delete/{mineId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteConfig(@ApiParam(value = "ID of mine config to delete",required=true) @PathVariable("mineId") UUID mineId);


    @ApiOperation(value = "Get mine config", nickname = "getMineConfig", notes = "return configured details (if any) for a given mine id.", response = MineConfig.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = MineConfig.class) })
    @RequestMapping(value = "/mine/config/{mineId}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<MineConfig> getMineConfig(@ApiParam(value = "ID of mine to fetch",required=true) @PathVariable("mineId") UUID mineId);


    @ApiOperation(value = "Get mine descriptors", nickname = "getMineDescriptors", notes = "return descriptors (if any) for a given mine id.", response = MineDescriptor.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = MineDescriptor.class) })
    @RequestMapping(value = "/mine/descriptors/{mineId}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<MineDescriptor> getMineDescriptors(@ApiParam(value = "ID of mine to fetch",required=true) @PathVariable("mineId") UUID mineId);


    @ApiOperation(value = "Get mine ID", nickname = "getNewMine", notes = "return a new mine ID to use in all subsequent requests", response = UUID.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = UUID.class) })
    @RequestMapping(value = "/mine/config/new/",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<UUID> getNewMine();


    @ApiOperation(value = "Retrieve set of tools suitable for the given mine", nickname = "mineDataToolsMineIdGet", notes = "", response = DataTool.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = DataTool.class, responseContainer = "List") })
    @RequestMapping(value = "/mine/dataTools/{mineId}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<DataTool>> mineDataToolsMineIdGet(@ApiParam(value = "ID of mineconfig to fetch tools for",required=true) @PathVariable("mineId") UUID mineId);


    @ApiOperation(value = "Set tools to be used for the given mine", nickname = "mineDataToolsMineIdPost", notes = "", response = DataTool.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = DataToolResponse.class) })
    @RequestMapping(value = "/mine/dataTools/{mineId}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.POST)
    ResponseEntity<List<DataTool>> mineDataToolsMineIdPost(@ApiParam(value = "ID of mineconfig to set tools for",required=true) @PathVariable("mineId") UUID mineId);


    @ApiOperation(value = "Set mine descriptors", nickname = "setMineDescriptors", notes = "Set the properties associated with this mine, e.g. name", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Descriptors successfully added to mine.") })
    @RequestMapping(value = "/mine/descriptors/{mineId}",
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.POST)
    ResponseEntity<Void> setMineDescriptors(@ApiParam(value = "Descriptors to set for Mine" ,required=true )  @Valid @RequestBody MineDescriptor body,@ApiParam(value = "ID of mine to fetch",required=true) @PathVariable("mineId") UUID mineId);

}
